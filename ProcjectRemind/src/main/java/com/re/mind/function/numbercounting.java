package com.re.mind.function;

public class numbercounting {
	public String number(String number) {
		 String endnum=null;
		 int num=Integer.parseInt(number.substring(2));
		 System.out.println(num);
		 String totalnum=number.substring(0,2);
		 String numalpha=number.substring(1,2);
		 String numbeta=number.substring(0,1);
		 System.out.println(numalpha);
		 System.out.println(numbeta);
	
		 if((num+1)==100){
			 if(numalpha.equals("a")){
			 		totalnum=numbeta+"b";	
			 }
			 else if(numalpha.equals("b")){
			 		totalnum=numbeta+"c"	;
			 }
			 else if(numalpha.equals("c")){
			 		totalnum=numbeta+"d"	;
			 }
			 else  if(numalpha.equals("d")){
			 		totalnum=numbeta+"e"	;
			 }
			 else  if(numalpha.equals("e")){
			 		totalnum=numbeta+"f"	;
			 }
			 else  if(numalpha.equals("f")){
			 		totalnum=numbeta+"g"	;
			 }
			 else if(numalpha.equals("g")){
			 		totalnum=numbeta+"h"	;
			 }
			 else if(numalpha.equals("h")){
			 		totalnum=numbeta+"i"	;
			 }
			 else  if(numalpha.equals("i")){
			 		totalnum=numbeta+"j"	;
			 }
			 else  if(numalpha.equals("j")){
			 		totalnum=numbeta+"k"	;
			 }
			 else if(numalpha.equals("k")){
			 		totalnum=numbeta+"l"	;
			 }
			 else if(numalpha.equals("l")){
			 		totalnum=numbeta+"n"	;
			 }
			 else  if(numalpha.equals("n")){
			 		totalnum=numbeta+"m"	;
			 }
			 else  if(numalpha.equals("m")){
			 		totalnum=numbeta+"o"	;
			 }
			 else  if(numalpha.equals("o")){
			 		totalnum=numbeta+"p"	;
			 }
			 else  if(numalpha.equals("p")){
			 		totalnum=numbeta+"q"	;
			 }
			 else  if(numalpha.equals("q")){
			 		totalnum=numbeta+"r"	;
			 }
			 else if(numalpha.equals("r")){
			 		totalnum=numbeta+"s"	;
			 }
			 else  if(numalpha.equals("s")){
			 		totalnum=numbeta+"t"	;
			 }
			 else if(numalpha.equals("t")){
			 		totalnum=numbeta+"u"	;
			 }
			 else if(numalpha.equals("u")){
			 		totalnum=numbeta+"v"	;
			 }
			 else  if(numalpha.equals("v")){
			 		totalnum=numbeta+"w"	;
			 }
			 else  if(numalpha.equals("w")){
			 		totalnum=numbeta+"x"	;
			 }
			 else if(numalpha.equals("x")){
			 		totalnum=numbeta+"y"	;
			 }
			 else if(numalpha.equals("y")){
			 		totalnum=numbeta+"z"	;
			 }
			 else if(numalpha.equals("z")){
				 if(numbeta.equals("a")){
				 		numbeta="b";	
				 }
				 else if(numbeta.equals("b")){
				 		numbeta="c"	;
				 }
				 else if(numbeta.equals("c")){
				 		numbeta="d"	;
				 }
				 else  if(numbeta.equals("d")){
				 		numbeta="e"	;
				 }
				 else  if(numbeta.equals("e")){
				 		numbeta="f"	;
				 }
				 else  if(numbeta.equals("f")){
				 		numbeta="g"	;
				 }
				 else if(numbeta.equals("g")){
				 		numbeta="h"	;
				 }
				 else if(numbeta.equals("h")){
				 		numbeta="i"	;
				 }
				 else  if(numbeta.equals("i")){
				 		numbeta="j"	;
				 }
				 else  if(numbeta.equals("j")){
				 		numbeta="k"	;
				 }
				 else if(numbeta.equals("k")){
				 		numbeta="l"	;
				 }
				 else if(numbeta.equals("l")){
				 		numbeta="n"	;
				 }
				 else  if(numbeta.equals("n")){
				 		numbeta="m"	;
				 }
				 else  if(numbeta.equals("m")){
				 		numbeta="o"	;
				 }
				 else  if(numbeta.equals("o")){
				 		numbeta="p"	;
				 }
				 else  if(numbeta.equals("p")){
				 		numbeta="q"	;
				 }
				 else  if(numbeta.equals("q")){
				 		numbeta="r"	;
				 }
				 else if(numbeta.equals("r")){
				 		numbeta="s"	;
				 }
				 else  if(numbeta.equals("s")){
				 		numbeta="t"	;
				 }
				 else if(numbeta.equals("t")){
				 		numbeta="u"	;
				 }
				 else if(numbeta.equals("u")){
				 		numbeta="v"	;
				 }
				 else  if(numbeta.equals("v")){
				 		numbeta="w"	;
				 }
				 else  if(numbeta.equals("w")){
				 		numbeta="x"	;
				 }
				 else if(numbeta.equals("x")){
				 		numbeta="y"	;
				 }
				 else if(numbeta.equals("y")){
				 		numbeta="z"	;
				 }
				 else if(numbeta.equals("z")){
					 System.out.println("용량초과");
				 }
				 totalnum=numbeta+"a";
		
		 }
		 endnum="00";
		 }
		 else{
			 
		 num+=1;
		 if(num<10) {
			 endnum="0"+num;
		 }
		 else {
			 endnum=String.valueOf(num);
		 }
		 }
		
		 number=totalnum+endnum;
		 return number;
}
}
