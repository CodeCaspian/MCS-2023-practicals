//Q. 3 Using nodejs create a web page to read two file names from user and append contents of first file into second file. [20 M]
var http = require("http")
var fs = require('fs')

var result = fs.readFileSync("test.txt") //Reads File (returns data)

fs.appendFileSync("test2.txt", result) //Appends to File (doesn't return data)

// http.createServer((req, res)=>{
//   res.write(result)
//   res.end()
// }).listen(8080)