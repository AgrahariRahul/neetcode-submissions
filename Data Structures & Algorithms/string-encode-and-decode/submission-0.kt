class Solution {

    fun encode(strs: List<String>): String {
        if(strs.isEmpty()) return ""
                           
       var encoded =""
        for(str in strs){
            encoded = encoded+"#"
            var charCode = ""
            for(char in str){
                charCode = charCode+"${char.code},"
            }
            encoded = encoded+charCode
        }
       println("Encoded String: $encoded")
       return encoded
    }

    fun decode(str: String): List<String> {
        if(str.isEmpty()) return emptyList()
    
       val encodedStr = str.split("#")
       var wordList = mutableListOf<String>()
       for(i in 1..encodedStr.size-1){
          var encode = encodedStr[i]
             
         if(!encode.isEmpty()){
            var charCodeArray = encode.split(",")
            var word =""
            for(code in charCodeArray){
              if(!code.isEmpty()){
                word = word + code.toInt().toChar()
              }
            }
            if(!word.isEmpty()){
              wordList.add(word)
            }
         }else{
            wordList.add("")
         }
       }
       println("decode str: ${wordList.toString()}")
       return wordList.toList()
    }
}
