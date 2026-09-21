class Solution {

    fun encode(strs: List<String>): String {
       val encodeString = StringBuilder("${strs.size}")
       for(str in strs){
         encodeString.append("%#%")
         encodeString.append(str)
         
       }
       return encodeString.toString()
       
    }

    fun decode(str: String): List<String> {
       println("decode str : ${str}")
       val decodeArray = str.split("%#%")
       val size:Int = decodeArray?.takeIf{it.size>0}?.let{it[0].toInt()}?:0
       val res = mutableListOf<String>()
       if(size >= 1){
       for(i in 1..size){
        res.add(decodeArray[i])
       }
       }
        println("res : ${res.joinToString("#")}")
       return res.toList()
    }
}
