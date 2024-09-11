/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lo;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author luis
 */
public class Encrip
  {
    String secretKey = "htyTu75%jd#$k";
    private String cadena=null;

    public Encrip(String cadena)
      {
        this.cadena = cadena;
      }

    Encrip()
      {
       this.cadena = cadena;
      }
    
    
    public String ecnode()
      {
        String encriptacion = "";
        try
          {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = getCadena().getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
          } catch(Exception ex)
            {
              JOptionPane.showMessageDialog(null, "Algo salió mal ");
            }
        return encriptacion;
      }
    public String deecnode()
      {
         String desencriptacion = "";
        try
          {
            byte[] message = Base64.decodeBase64(getCadena().getBytes("utf-8"));
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digestOfPassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);
            SecretKey key = new SecretKeySpec(keyBytes, "DESede");
            Cipher decipher = Cipher.getInstance("DESede");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");
          }catch(Exception ex)
            {
              JOptionPane.showMessageDialog(null, "Algo salió mal aqui"+ex);
            }
        return desencriptacion;
      }

    /**
     * @return the cadena
     */
    public String getCadena()
      {
        return cadena;
      }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena)
      {
        this.cadena = cadena;
      }
    
  }
