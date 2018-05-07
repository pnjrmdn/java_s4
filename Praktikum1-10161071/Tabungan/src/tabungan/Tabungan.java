
package tabungan;

public class Tabungan {

        private int saldo;
        
        public  Tabungan(int initsaldo){
            this.saldo = initsaldo;
        }

        public int getSaldo(){
            return saldo;
        }
        public int simpanUang(int jumlah){
            saldo+=jumlah;
            return saldo;
        }
        
        public boolean ambilUang(int jumlah){
            if(saldo>=jumlah){
                int saldototal = saldo - jumlah;
                saldo =- saldototal;
                return true;
            }
            else{
                return false;
            }
        }
    
    
}
