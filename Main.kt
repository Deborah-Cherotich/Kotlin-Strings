fun main(args: Array<String>) {
//   var place = "Joburg"
//    place = "Johannesburg"
    var bucket = "bird"
    bucket = "birds"
 var fname = "Deborah"
    var lname = "Cherotich"
    var fullName = "$fname $lname"

//string concertination

println(fullName)
    var name = "Edward"
    var age = 26
    var profession = "Govenor"
    var statement = "$name who is $age years old is a $profession"
    println(statement)
    var place = "Deborah"
    var no = 22
    var workplace ="Software engineering"
    var result = "$place who is $no years old is a $workplace"
    println(result)


//    kotlin string indexing

//     var fruit = "mango"
//    println(fruit[0])
//    println(fruit[1])
//    println(fruit[2])
//    println(fruit[3])
//    println(fruit[4])
//
//    println(fruit.first())
//    println(fruit.last())
//   println(fruit.indexOf(("g"))
 var fruit = "banana"
 println(fruit.indexOf("a"))
    println(fruit.lastIndexOf("a"))

    var weight = 40.7
//println("I weigh" + weight)
println(weight.toString() + "kgs is my weight")

//    String Comparison

    var city = "Nairobi"
    var city2 = "Kiambu"
    println(city==city2)
    println(city.equals(city2))
println(city.uppercase())
    println(city.lowercase())

//Empty and blank strings
    var emptyString = ""
    var blankString = " "
    println(emptyString.isEmpty())
    println(blankString.isEmpty())
    println(emptyString.isBlank())
    println(blankString.isBlank())

//    tough
//var statements = "Good morning"
//    println(statements.indexOf("x"))
//println(statements[45])
    val town = "kitale"
    println(town)
    println(town.trimStart())
println(town.trimEnd())
    println(town.trim())
    var statement1 = "The blue car overtook the black car"
    println(statement1.replace("car", "bike"))
    println(statement1.replace("a","v"))
    println(statement1.startsWith("The"))
    println(statement1.endsWith("That"))
    println(statement1.endsWith("car"))

//    Split fuction
    var statement2 = "The blue car overtook the black car"
    println(statement2.split(" "))
    println(statement2.split(""))
    println(statement2.split(","))
    println(statement2.split("a"))
    var dateNow = "2024-02-28"
    println(dateNow.split("-"))
}
