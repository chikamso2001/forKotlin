fun main(){
    print("What should be the length of the triangle: ")
    val length :Int = readLine()!!.toInt()
    println("\nHere is your triangle")
    printUpwards(length)
    printDownWards(length)
    printTriangle(length)

}
//For printing stars
fun printStars(num:Int){
    for(i in 1..num){
        print("*")
    }
    print("\n")
}
//For printing stars upwards
fun printUpwards(length:Int){
    for(i in 1..length){
        printStars(i)
    }
}
//for printing stars downwards
fun printDownWards(length: Int){
    for(i in length downTo 0){
        printStars(i)
    }
}
//For printing an Isosceles triangle
fun printTriangle(length: Int){
    printUpwards(length)
    printDownWards(length-1)
}
