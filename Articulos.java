import java.util.Scanner;
    public class Articulos {
        private String keyprodcut;
        private String description;
        private int price;
        private String expiration;
        int can;


        public Articulos(){
            this.keyprodcut="";
            this.description="";
            this.price=0;
            this.expiration="";
        }
        public Articulos( String k, String d, int p, String e){
            this.keyprodcut=k;
            this.description=d;
            this.price=p;
            this.expiration=e;
        }
        public Articulos(int can){
            this.can=can;

        }
        @Override
        public String toString(){
            return "{"+"Keyproduct:"+keyprodcut+"Description:"+description+"Price:"+price+"Expiration date:"+expiration+"}\n";
        }
        public void setKeyprodcut(String keyprodcut){ this.keyprodcut=keyprodcut; }
        public String getKeyproduct(){ return keyprodcut; }
        public String getDescription(){ return description; }
        public void setDescription(String description) { this.description = description; }
        public int getPrice(){ return price; }
        public void setExpiration(String expiration) { this.expiration = expiration; }
        public int getCan(){
            return this.can=can;
        }
    }