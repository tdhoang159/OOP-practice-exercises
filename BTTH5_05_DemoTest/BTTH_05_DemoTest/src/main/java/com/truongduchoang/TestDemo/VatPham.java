package com.truongduchoang.TestDemo;

/**
 *
 * @author Truong Duc Hoang
 */
public abstract class VatPham {
    private String id;

    public String getId() {
        return id;
    }
    
    public void hienThi(){
        System.out.printf("ID: %s - ", this.id);
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
