package com.amitrei;


import com.amitrei.beans.Company;
import com.amitrei.dbdao.CompaniesDBDAO;
import com.amitrei.test.FullTest;


public class program {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        FullTest test = new FullTest();
        test.testAll();





    }

}
