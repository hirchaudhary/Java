class StringManipulator {
    public String trimAndConcat(String first, String second){
        String newString = first.trim() + second;
        return newString;
    }
    public Integer getIndexOrNull(String string, char oneChar){
        if(string.indexOf(oneChar) >= 0) {
            return string.indexOf(oneChar);
        }
        return null;
    }
    public Integer getIndexOrNull(String first, String second){
        if(first.indexOf(second) >= 0){
            return first.indexOf(second);
        }
        return null;
    }
    public String concatSubstring(String first, int one, int two, String second){
        String newString = first.substring(one,two).concat(second);
        return newString;
    }
}
