// Q. 3 Create a Node.js file that writes an HTML form, with an upload field. [20 M]

var http =require('http')
var express =require('express')
var app = express()


app.get('/',function(request,response){
    //Create html file and give path
    response.sendFile('C:\\Users\\A\\Desktop\\Practical\\Node\\form7.html')
}).listen(8080)