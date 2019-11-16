

### 思维导图

![image-20191116152952425](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20191116152952425.png)



### E-R图

![img](file:///C:\Users\ADMINI~1\AppData\Local\Temp\msohtmlclip1\01\clip_image002.jpg)

### 数据字典

#####     user（用户表）

| 字段     | 类型    | 长度 | 可为空 | 描述                                                  |
| -------- | ------- | ---- | ------ | ----------------------------------------------------- |
| userID   | int     |      | 不为空 | 主键，唯一，自增长                                    |
| username | varchar | 50   | 不为空 | 用户名，唯一，用于登录                                |
| password | varchar | 50   | 不为空 | 密码，MD5加密，由字母，数字，_组成，至少6位，最长16位 |
| phone    | varchar | 15   | 可为空 | 联系电话                                              |
| Sex      | char    | 1    | 可为空 | 性别，男：1，女：0                                    |
| Role     | int     |      | 不为空 | 角色，0-用户，1-管理员                                |
| ImageUrl | varchar | 50   | 可为空 | 头像地址                                              |
| state    | char    | 1    | 不为空 | 账号状态，不可用：0，可用：1                          |



#####  song音乐表)

| 字段     | 类型    | 长度 | 可为空 | 描述                                                     |
| -------- | ------- | ---- | ------ | -------------------------------------------------------- |
| songID   | int     |      | 不为空 | 主键，唯一，自增长                                       |
| songName | varchar | 50   | 不为空 | 歌曲名                                                   |
| singer   | Varchar | 30   | 不为空 | 歌手                                                     |
| fileUrl  | varchar | 120  | 不为空 | 歌曲地址                                                 |
| hits     | Int     |      | 不为空 | 试听次数；默认值-0                                       |
| Download | int     |      | 不为空 | 下载次数；默认值-0                                       |
| songType | Int     |      | 不为空 | 1-   流行音乐；2-说唱；3-舞曲；4-民谣；5-其他的;默认值-5 |

 

#####  comment（评论表）

| 字段        | 类型     | 长度 | 可为空 | 描述               |
| ----------- | -------- | ---- | ------ | ------------------ |
| commentID   | int      |      | 不为空 | 主键，唯一，自增长 |
| userID      | Int      |      | 不为空 | 评论者             |
| songID      | int      |      | 不为空 | 评论的歌曲         |
| contents    | varchar  | 200  | 不为空 | 评论的内容         |
| commentDate | datetime |      | 不为空 | 评论日期           |



##### mylove（我的喜欢）

| 字段   | 类型 | 长度 | 可为空 | 描述               |
| ------ | ---- | ---- | ------ | ------------------ |
| loveID | int  |      | 不为空 | 主键，唯一，自增长 |
| userID | Int  |      | 不为空 | 评论者             |
| songID | int  |      | 不为空 | 评论的歌曲         |



##### songList(歌单)

| 字段         | 类型     | 长度 | 可为空 | 描述               |
| ------------ | -------- | ---- | ------ | ------------------ |
| songListID   | int      |      | 不为空 | 主键，唯一，自增长 |
| songListName | varchar  | 20   | 不为空 | 歌单名             |
| createUserID | Int      |      | 不为空 | 创建者             |
| createDate   | datetime |      | 不为空 | 创建日期           |
| introduction | Varchar  | 200  | 不为空 | 简介               |
| imageUrl     | Varchar  | 120  | 不为空 | 歌单头像           |



##### songListdetailed(歌单细表)

| 字段       | 类型 | 长度 | 可为空 | 描述   |
| ---------- | ---- | ---- | ------ | ------ |
| songListID | int  |      | 不为空 | 歌单ID |
| songID     | Int  |      | 不为空 | 歌曲   |

 

##### collect_music（音乐收藏表） 

| 字段             | 类型 | 长度 | 可为空 | 描述       |
| ---------------- | ---- | ---- | ------ | ---------- |
| songListID       | int  |      | 不为空 | 歌单ID     |
| collectionUserID | Int  |      | 不为空 | 收藏的用户 |

 

 