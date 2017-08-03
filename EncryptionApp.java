/*
EncryptionApp.java
@Yo
03/08/2017
*/
import javax.swing.*;//using JOptionPane UI to promt the user
public class EncryptionApp{
	public static void main(String args[]){

		String userPass;
		String newPass;


		//creating an object
		Encryption encryp = new Encryption();

		int skip= JOptionPane.showConfirmDialog(null, "Would you like to encrypt your password?", "Please select", JOptionPane.YES_NO_OPTION);//asking the user for the craic
		if(skip == 1){
			//input
			userPass = JOptionPane.showInputDialog(null, "Type in your password");
			encryp.setUser(userPass);

			//process
			encryp.compute();

			//output
			newPass = encryp.getNew();
			JOptionPane.showMessageDialog(null, "Your encrypted password is " + newPass);
		}
		else{
			JOptionPane.showMessageDialog(null, "Good bye!");
		}

	}
}