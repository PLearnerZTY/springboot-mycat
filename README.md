# springboot-mycat
springboot整合mycat案例，实现读写分离，主从复制


1：本案例使用mycat中间件，实现读写分离、mysql主从复制

2：本案例使用的mycat版本是1.6，mysql版本5.7，springboot版本2.1.3、maven仓库

3：实现本案例先要做的事情：
  1）安装mycat服务，具体安装步骤咨询度娘
  2）安装主库master mysql、从库slave mysql，具体安装步骤请参考：https://blog.csdn.net/kisscatforever/article/details/78776133
  
4：异常处理：
  在进行主从复制的时候，可能会遇到主从数据不一致，导致从库停止同步，可以先看下从库状态 show slave status,注意那两个Running状态 YES/YES
  如果有一个是no,这时候需要在从库上执行
  
  1）停止从库服务：stop slave
  
  2)在从库上重新设置同步节点：
  
    change master to master_host='127.0.0.1',master_port=3306,master_user='root',master_password='123456',master_log_file='mysql-bin.000004',master_log_pos=2141;
    
    注意：此执行语句必须要与这保持一致，可以更改参数master表示数据库，请设置master数据的host、port、username、password
          master_log_file='mysql-bin.000004'：mysql-bin.000004必须跟主库保持一致(对应主库：File)
          master_log_pos=2141：2141必须跟主库保持一致（对应主库值：Position）
          主库状态，在主库数据库执行：show master status,
          
  3)启动从库服务：start slave
  
5：mycat配置文件schema.xml、server.xml和数据库脚本见config目录下

6：模拟主库master服务停掉，此时通过mycat会自动切换到从库slave，读写操作都会在slave库上进行；
   
   重新启动master服务，此时读写任slave库上进行，还是以从库slave为主，新增的数据不会添加到主库上，此时想重新切换master为主库：
   
   1）修改mycat安装文件下的conf/dnindex.properties文件中，把localhost1设置0，让localhost1重新成为主节点库
   
   2）重启mycat，重启之后，恢复原master主库
   
   3）注意：此时新增数据，会在主库master中，没有同步到从库slave中，此时就需要操作步骤4异常处理；处理完毕，主从就能同步
            处理完毕之后，发现主从库数据不一致，此时就需要对主从库数据同步处理
