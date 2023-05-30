# Preview

This project is a practice of using Maven's MultiModule to manage the file sturcture in an MVC architecture


http://localhost:8080/

you will look

```json
[
{
"id": 1,
"name": "Hoxton",
"age": 25
},
{
"id": 2,
"name": "Hoxton",
"age": 25
}
]
```


And I have configured MultiProfile settings, which allow me to set up different development environments in the pom.xml file of the application project. If I want to confirm the currently used environment, I can run the application and see if the startup screen is different, or I can input "mvn help:active-profiles" to check the current development environment.

<img width="670" alt="image" src="https://github.com/Hoxton019030/SpringBoot-MultiModule-MVC-Structure/assets/98711945/1c0bbe8f-45ca-4449-9e3b-230fdcf2f148">



# 前言

這個專案練習使用Maven的MultiModule，來管理MVC架構的後端程式碼，供參考。

http://localhost:8080/

你會看到


```json
[
{
"id": 1,
"name": "Hoxton",
"age": 25
},
{
"id": 2,
"name": "Hoxton",
"age": 25
}
]
```

並且我有做MultiProfile的設置，可以在appliaction project的pom.xml中配置不同的開發環境，如果想確認目前使用的環境，可以執行起來，看看啟動畫面是否不同，或是輸入
mvn help:active-profiles
來確認目前的開發環境
