/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gramatica0;

import java.util.Scanner;
import util.LeerDatos;

public class entero2 {
    private LeerDatos leer=new LeerDatos();
    private Scanner sc=new Scanner(System.in);
    String v=leer.ingresarCadena();
    String [] elementos = v.split(" ");
    public void variable(){
        try{
        if(elementos[0].equals("int") || elementos[0].equals("float") || elementos[0].equals("double")
                || elementos[0].equals("char")){
            System.out.println("<variable> -->"+elementos[0]);
        }else {
            System.out.println("No puedes generar "+elementos[0]);
            System.exit(0);
        }
        
            if(elementos[1].charAt(0)=='1' || elementos[1].charAt(0)=='2' || elementos[1].charAt(0)=='3'
                    || elementos[1].charAt(0)=='4' || elementos[1].charAt(0)=='5' || elementos[1].charAt(0)=='6'
                    || elementos[1].charAt(0)=='7' || elementos[1].charAt(0)=='8' || elementos[1].charAt(0)=='9'
                    || elementos[1].charAt(0)=='0' || elementos[1].charAt(0)=='1'){
                System.exit(0);
            }else
            if(elementos[1].equals(elementos[1])){
            System.out.println("<NombreVariable> -->"+elementos[0]+" "+elementos[1]);
        }
         if(elementos[2].equals(";")){
                this.puntoComa();
            }else if(elementos[2].equals("=")){
                    this.igual();
            }else if(elementos[2].equals(",")){
                this.coma();
            }
        
    
    }catch(Exception ex){
    }
}
    private void puntoComa(){
        System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+elementos[2]);
        System.exit(0);
    }
    private void puntoComa1(){
        System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]+" "+elementos[4]);
        
    }
    private void puntoComa2(){
        System.out.println("<Nombre de variable> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]);
    }
    private void igual(){
        System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+elementos[2]);
            if(elementos[0].equals("int")){
            int guardo=0;
            guardo=Integer.parseInt(elementos[3]);
            }else if(elementos[0].equals("float")){
                float guardofloat=0f;
            guardofloat=Float.parseFloat(elementos[3]);
            } else if(elementos[0].equals("double")){
                double guardodouble= 0 ;
                guardodouble= Double.parseDouble(elementos[3]);
            }
            else if(elementos[0].equals("char")){
                this.igual_();
                System.exit(0);
            }     
        if(elementos[3].equals(elementos[3]) ){
            System.out.println("<Numeros> -->" +elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]);
           
        if(elementos[4].equals(";")){
            this.puntoComa1();
            
        } else if(elementos[4].equals(",")){
            this.coma();
        }
    
    
        }
    }
    private void coma(){
        //System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+elementos[2]);
        this.variable2();
        
        }
    private void variable2(){
        if(elementos[3].charAt(0)=='1' || elementos[3].charAt(0)=='2' || elementos[3].charAt(0)=='3'
                    || elementos[3].charAt(0)=='4' || elementos[3].charAt(0)=='5' || elementos[3].charAt(0)=='6'
                    || elementos[3].charAt(0)=='7' || elementos[3].charAt(0)=='8' || elementos[3].charAt(0)=='9'
                    || elementos[3].charAt(0)=='0' || elementos[3].charAt(0)=='1'){
            
        } else if(elementos[3].equals(elementos[3])){
            System.out.println("<Nombre de variable> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]);
        } 
         if(elementos[4].equals(",")){
             System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3] + " " +elementos[4]);
            this.variable3();
         }else if(elementos[4].equals("=")){
             System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3] + " " +elementos[4]+" "+elementos[5]+" "+elementos[6]);
             this.igual1();
        }else if(elementos[4].equals(";")){
            System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3] + " " +elementos[4]+" "+elementos[5]+" "+elementos[6]);
            this.puntoComa1();
        }
         
    }
      private void variable3(){
          if(elementos[5].charAt(0)=='1' || elementos[5].charAt(0)=='2' || elementos[5].charAt(0)=='3'
                    || elementos[5].charAt(0)=='4' || elementos[5].charAt(0)=='5' || elementos[5].charAt(0)=='6'
                    || elementos[5].charAt(0)=='7' || elementos[5].charAt(0)=='8' || elementos[5].charAt(0)=='9'
                    || elementos[5].charAt(0)=='0' || elementos[5].charAt(0)=='1'){
            } else if(elementos[5].equals(elementos[5])){
            System.out.println("<Nombre de variable> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]+" "+elementos[4]+" "+elementos[5]);
        } 
        
        if(elementos[6].equals(";")){
            this.puntoComa2();
        }else if(elementos[6].equals("=")){
             this.igual2();
        } else {
            System.exit(0);
        }
      }
      private void igual1(){
          System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
           elementos[2]+" "+elementos[3]+" "+ elementos[4]+ " "+ elementos[5]);
           if(elementos[0].equals("int")){
            int guardo=0;
            guardo=Integer.parseInt(elementos[5]);
            }else if(elementos[0].equals("float")){
                float guardofloat=0f;
            guardofloat=Float.parseFloat(elementos[5]);
            }else if(elementos[0].equals("double")){
                double guardodouble= 0 ;
                guardodouble= Double.parseDouble(elementos[3]);
            }
        if(elementos[5].equals(elementos[5]) ){
            System.out.println("");
    } 
        if(elementos[6].equals(";")){
            this.puntoComa();
            
        } else if(elementos[6].equals(",")){
            this.coma();
        }
    
      }
      private void igual2(){
         System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]);

        if(elementos[0].equals("int")){
            int guardo=0;
            guardo=Integer.parseInt(elementos[7]);
            }else if(elementos[0].equals("float")){
                float guardofloat=0f;
            guardofloat=Float.parseFloat(elementos[7]);
            }else if(elementos[0].equals("double")){
                double guardodouble= 0 ;
                guardodouble= Double.parseDouble(elementos[3]);
            }
        if(elementos[8].equals(";")){
           System.out.println("<Nombre de variable> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]
           +" "+elementos[7]+" "+elementos[8]);
        }
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      public void variable_(){
        if(elementos[0].equals("int") || elementos[0].equals("float") || elementos[0].equals("double")
                || elementos[0].equals("char")){
            System.out.println("<variable> -->"+elementos[0]);
        }
        
            if(elementos[1].charAt(0)=='1' || elementos[1].charAt(0)=='2' || elementos[1].charAt(0)=='3'
                    || elementos[1].charAt(0)=='4' || elementos[1].charAt(0)=='5' || elementos[1].charAt(0)=='6'
                    || elementos[1].charAt(0)=='7' || elementos[1].charAt(0)=='8' || elementos[1].charAt(0)=='9'
                    || elementos[1].charAt(0)=='0' || elementos[1].charAt(0)=='1'){
                System.exit(0);
            }else
            if(elementos[1].equals(elementos[1])){
            System.out.println("<NombreVariable> -->"+elementos[0]+" "+elementos[1]);
        }
         if(elementos[2].equals(";")){
                this.puntoComa_();
            }else if(elementos[2].equals("=")){
                    this.igual_();
            }else if(elementos[2].equals(",")){
                this.coma_();
            }
        
    }
    private void puntoComa_(){
        System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+elementos[2]);
        System.exit(0);
    }
    private void puntoComa1_(){
        System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]+" "+elementos[7]
        +" "+elementos[8]+" "+elementos[9]+" "+elementos[10]+" "+elementos[11]+" "+elementos[12]);
        
    }
    private void puntoComa2_(){
        System.out.println("<Nombre de variable> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]);
    }
    private void igual_(){
        
        if(elementos[3].equals("'") ){
            System.out.println("<comillas> -->" +elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]);
            
           if(elementos[4].equals(elementos[4]))
               System.out.println("<Nombre de variable> -->" +elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]+" "+elementos[4]);
           if(elementos[5].equals("'"))
               System.out.println("<comillas> -->" +elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]+" "+elementos[4]+" "+elementos[5]);
        if(elementos[6].equals(";")){
            this.puntoComa2_();
            
        } else if(elementos[6].equals(",")){
            this.coma_();
        }
    
    
        }
    }
    private void coma_(){
        System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+elementos[3]
        +" "+elementos[4]+" "+elementos[5]+" "+elementos[6]);
        this.variable2_();
        
        }
    private void variable2_(){
        if(elementos[3].charAt(0)=='1' || elementos[3].charAt(0)=='2' || elementos[3].charAt(0)=='3'
                    || elementos[3].charAt(0)=='4' || elementos[3].charAt(0)=='5' || elementos[3].charAt(0)=='6'
                    || elementos[3].charAt(0)=='7' || elementos[3].charAt(0)=='8' || elementos[3].charAt(0)=='9'
                    || elementos[3].charAt(0)=='0' || elementos[3].charAt(0)=='1'){
            
        } else if(elementos[3].equals(elementos[3])){
            System.out.println("<Nombre de variable> -->"+elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+elementos[3]
        +" "+elementos[4]+" "+elementos[5]+" "+elementos[6]+" "+ elementos[7]);
        } 
         if(elementos[8].equals(",")){
             System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3] + " " +elementos[4]);
            this.variable3_();
         }else if(elementos[8].equals("=")){
             System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3] + " " +elementos[4]+" "+elementos[5]+" "+elementos[6]+" "+elementos[7]
             +" "+elementos[8]);
             this.igual1_();
        }else if(elementos[8].equals(";")){
            System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3] + " " +elementos[4]+" "+elementos[5]+" "+elementos[6]+" "+elementos[6]);
            this.puntoComa1_();
        }
         
    }
      private void variable3_(){
          if(elementos[5].charAt(0)=='1' || elementos[5].charAt(0)=='2' || elementos[5].charAt(0)=='3'
                    || elementos[5].charAt(0)=='4' || elementos[5].charAt(0)=='5' || elementos[5].charAt(0)=='6'
                    || elementos[5].charAt(0)=='7' || elementos[5].charAt(0)=='8' || elementos[5].charAt(0)=='9'
                    || elementos[5].charAt(0)=='0' || elementos[5].charAt(0)=='1'){
            } else if(elementos[5].equals(elementos[5])){
            System.out.println("<Nombre de variable> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]+" "+elementos[4]+" "+elementos[5]);
        } 
        
        if(elementos[6].equals(";")){
            this.puntoComa2_();
        }else if(elementos[6].equals("=")){
             this.igual2_();
        } else {
            System.out.println("error");
            System.exit(0);
        }
      }
      private void igual1_(){
       
        if(elementos[9].equals("'") ){
            System.out.println("<comillas> -->" +elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]+" "+elementos[7]
            +" "+elementos[8]+" "+elementos[9]);
            
           if(elementos[10].equals(elementos[10]))
               System.out.println("<Nombre de variable> -->" +elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]+" "+elementos[7]
            +" "+elementos[8]+" "+elementos[9]+elementos[10]);
           if(elementos[11].equals("'"))
               System.out.println("<comillas> -->" +elementos[0]+" "+elementos[1]+" "+elementos[2]+" "+
                    elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]+" "+elementos[7]
            +" "+elementos[8]+" "+elementos[9]+" "+elementos[10]+" "+elementos[11]);
        if(elementos[12].equals(";")){
            this.puntoComa1_();
            
        } else if(elementos[6].equals(",")){
            this.coma_();
        }
        }
      }
      private void igual2_(){
         System.out.println("<Seguir/Final> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]);

        if(elementos[0].equals("int")){
            int guardo=0;
            guardo=Integer.parseInt(elementos[7]);
            }else if(elementos[0].equals("float")){
                float guardofloat=0f;
            guardofloat=Float.parseFloat(elementos[7]);
            }else if(elementos[0].equals("double")){
                double guardodouble= 0 ;
                guardodouble= Double.parseDouble(elementos[3]);
            }
        if(elementos[8].equals(";")){
           System.out.println("<Nombre de variable> -->"+elementos[0]+" "+elementos[1]+" "+
                    elementos[2]+" "+elementos[3]+" "+elementos[4]+" "+elementos[5]+" "+elementos[6]
           +" "+elementos[7]+" "+elementos[8]);
        }
      }
}