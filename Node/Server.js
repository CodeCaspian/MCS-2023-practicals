//Create a Simple Web Server using node js. [20 M]
//If you want html setHeader
var http = require('http')

//http callback has request, response
http.createServer(function(request,response){
    response.write("created first web server")
    response.end()
}).listen(8080)

