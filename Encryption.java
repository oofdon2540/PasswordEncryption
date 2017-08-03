/*
Encryption.java
@Yo
03/08/2017
*/
public class Encryption{
	//declaring variables
	private String userPass;
	private StringBuffer buff;
	private String newPass;

	//constructor
	public Encryption(){
		userPass = "";
		buff = new StringBuffer();
		newPass = "";
	}

	//setter - only for input
	public void setUser (String userPass){
		this.userPass = userPass;
	}

	//compute
	public void compute(){
		for(int i=0;i<userPass.length();i++){//looping through the word that is typed by the user
			//encryption pattern
			if(userPass.charAt(i) =='a' || userPass.charAt(i) =='b' || userPass.charAt(i) =='c'){
				buff.append('¿');
			}
			else if(userPass.charAt(i) =='d' || userPass.charAt(i) =='e' || userPass.charAt(i) =='f'){
				buff.append('Ë');
			}
			else if(userPass.charAt(i) =='g' || userPass.charAt(i) =='h' || userPass.charAt(i) =='i'){
				buff.append('¡');
			}
			else if(userPass.charAt(i) =='j' || userPass.charAt(i) =='k' || userPass.charAt(i) =='l'){
				buff.append('´');
			}
			else if(userPass.charAt(i) =='m' || userPass.charAt(i) =='n' || userPass.charAt(i) =='o'){
				buff.append('à');
			}
			else if(userPass.charAt(i) =='p' || userPass.charAt(i) =='q' || userPass.charAt(i) =='r'){
				buff.append('é');
			}
			else if(userPass.charAt(i) =='s' || userPass.charAt(i) =='t' || userPass.charAt(i) =='u'){
				buff.append('è');
			}
			else if(userPass.charAt(i) =='v' || userPass.charAt(i) =='w' || userPass.charAt(i) =='x'){
				buff.append('Ò');
			}
			else if(userPass.charAt(i) =='y' || userPass.charAt(i) =='z'){
				buff.append('Ê');
			}
			else{
				buff.append(userPass.charAt(i));
			}
			newPass = buff.toString();//inserting the new word to the new variable
		}

	}
	//getter - only for output
	public String getNew(){
		return newPass;
	}
}