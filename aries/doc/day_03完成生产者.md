我把所有分支的代码合并到main分支了

接下来要做的事就是

## 1.拉取最新的main分支（本地的两个代码仓库都拉取）

完成

## 2.删除自己的开发分支，使自己回到main分支。

### 2.1.先回main分支

完成

### 2.2再删除自己的开发分支

完成

## 3.创建新的开发分支（基于main分支）

完成，并且现在处于新的开发分支

## 4.推送新分支

完成

## 5.开始写代码

使用代码生成插件生成代码

在provoder里创建对应服务的

provider-api模块和

provider-service模块

我之前创建了，我先删除重新创建

### 5.1创建api模块

创建模块是创建文件夹+pom.xml

模块名：provider-星座名-服务名-api,

例如：

```
provider-aries-scheduling--api
```

完成

把这个项目告诉idea,它是一个maven项目。

### 5.2修改父项目

provider项目中添加刚才创建的api项目

在provider下的pom.xml中修改

现在没问题了

### 5.3检查根项目

根项目现在有依赖模块和provider模块两个模块。

刚才写的api模块是根模块的孙子模块。（子模块的子模块）

检查完毕没问题。

第一个视频结束。

## 6.修改/编写service

这个视频编写service模块，以及使用代码生成器完成代码生成。

### 6.1编写service模块

创建service模块名，在provider模块内创建

在你们自己provider的下面

创建文件夹，格式：provider-星座名-服务名-service,

创建pom.xml（在刚才创建的文件夹内）

项目名多了一个-，修改。

改文件夹名和pom中的项目名。

### 6.2在provider模块中添加刚才创建的service模块



### 6.3创建数据库、数据表

生成代码需要把数据表导入到数据库中。

创建自己的数据库

创建完成

### 6.4完善api、service模块

主要是创建java文件夹和resource文件夹

src/main/java和src/main/resources

然后标记文件夹

就像刚才。

SourcesRoot

和

ResourcesRoot

service模块也一样

完成。



```
scheduling
```





## 7.准备编写consumer(消费者)



