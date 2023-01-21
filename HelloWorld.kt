fun main(){

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
