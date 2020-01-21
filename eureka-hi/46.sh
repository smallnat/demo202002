#!/usr/bin/env bash

######################### 修改以下配置
# 源文件
file=target/eureka-hi-0.0.1-SNAPSHOT.jar
# 目标主机
host=10.57.30.46
# 目标主机用户
user=admin
# 目标主机存放路径
path=/data01/work/springcloud/hello-service
#########################

# 编译
if [[ $1 != "scp" && x$1 == "x" ]];
then
    mvn clean install -Dmaven.test.skip=true
fi

# 上传
echo "-------- scp to $host ---------"
scp $file $user@$host:$path

#
echo "-------- done! --------"