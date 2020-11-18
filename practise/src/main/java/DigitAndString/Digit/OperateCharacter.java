package DigitAndString.Digit;

public class OperateCharacter {
    public static void main(String[] args) {
        String a = "结局，是否，会，飞开始看GV辅导费发v";
        String c =a.substring(2,6);//左闭右开
        String d = a.substring(1);
        String e = a.substring(0);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
/*        toCharArray()
        获取对应的字符数组*/
        char[] b = a.toCharArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


//      给出一句英文句子： "let there be light"
//      得到一个新的字符串，每个单词的首字母都转换为大写
        String s ="asd,wdd,dqwf,qwfwq,edqf,hgh,dfs,hjjt";
        String[] words= s.split(",");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char upperCaseFirstWord =Character.toUpperCase(word.charAt(0));
            String rest = word.substring(1);
            String capitalizedWord = upperCaseFirstWord+rest;
            words[i] = capitalizedWord;
        }
        String result = " ";
        for (String word:words
             ) {
            result += word +" ";
        }
        System.out.println(result);
        result = result.trim();
        System.out.println(result);


/*        英文绕口令
        peter piper picked a peck of pickled peppers
        统计这段绕口令有多少个以p开头的单词*/
        String s2 = "peter piper picked a peck of pickled peppers";
        String[] words2 =  s2.split(" ");
        int result2 =0;
/*        for (int i = 0; i < words2.length; i++) {
            String word = words2[i];
            int count =0;
            if (word.charAt(0) == 'p') {
                count +=1;//count++
            }
            result2 += count;

        }
        System.out.println("以p开头的单词有："+result2+"个");*/ //太复杂
        for (int i = 0; i < words2.length; i++) {
            String word = words[i];
            char firstWord =word.charAt(0);
            int count =0;
            if(firstWord=='p')
                count++;
            result2 += count;
        }
        System.out.printf("总共有%d个p开头的单词",result2);//结果不对
        System.out.println();



        //把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy

        String ss= "lengendary";
        char[] cc = ss.toCharArray();
        for (int i = 0; i <cc.length ; i++) {
            if (i%2 == 0)
                cc[i]=Character.toUpperCase(cc[i]);
        }
        String result3 = new String(cc);
        System.out.println(result3);





        ///把 lengendary 最后一个字母变大写
        int index =ss.length() -1;
        String lastWord = ss.substring(index);
        System.out.println(lastWord);
        System.out.println(index);
        lastWord=lastWord.toUpperCase();
        String new_ss = ss.substring(0,index)+lastWord;
        System.out.println(new_ss);

        //参考答案
        char[] cs = ss.toCharArray();
        cs[cs.length - 1] = Character.toUpperCase(cs[cs.length-1]);
        String result4 = new String(cs);
        System.out.printf(result4);
        System.out.println();

//        把最后一个two单词首字母大写
        String sss="Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int index2 = sss.lastIndexOf(" two ");
        char[] ccs = sss.toCharArray();
        System.out.println(index2);
        ccs[index2+1] = Character.toUpperCase(ccs[index2+1]);
        System.out.println(ccs);


    }
}
