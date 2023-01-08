//browser to prompt the user to download file using express js. [20 M]
var express=require('express')
var app=express()
app.get('/',function(request,response){
    response.download('test.txt')
}).listen(8080)