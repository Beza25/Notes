Equals method 
 
 public boolean equals(Object o){
        Product p = (Product)o;
        if(this.getCode().equals(p.getCode()) ){
            return true;
        }else{
            return false;
        }

    }
