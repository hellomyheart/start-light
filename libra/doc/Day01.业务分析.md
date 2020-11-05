## 业务分析

### 1.分析

​	本模块实现的功能是实现收藏功能、查看用户收藏列表、商品被收藏数量（商品、职位信息、文章、视频等）

基于SpringCloud框架，主要用redis 和 RabbitMQ来解决高并发问题

### 2.接口介绍

​	addFavorite  :添加收藏

​	返回 int

​	queryByUid：查看自己的收藏列表

​	返回 int

​	queryCount：查看商品被收藏数量

​	返回 int

### 前端参数
    addFavorite:FavoriteAddDto dto(uid,cid)
    
    queryByUid:uid

    queryCount:cid