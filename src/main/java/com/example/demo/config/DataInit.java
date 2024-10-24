package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entities.CategoriePress;
import com.example.demo.repository.CategoriePresseRepository;

@Component
public class DataInit implements CommandLineRunner {
 
    @Autowired
    private CategoriePresseRepository categoriePresseRepository;
    @Override
     public void run(String... args) throws Exception
     {CategoriePress Cate1=new CategoriePress((long)1,"ثقافي","Culturel","Cultural");
     CategoriePress Cate2=new CategoriePress((long)2,"إقتصادي","Economique","Economic");
     CategoriePress Cate3=new CategoriePress((long)3,"عام","publique","public");
     CategoriePress Cate4=new CategoriePress((long)4,"رياضي","sport","sport");
     CategoriePress Cate5=new CategoriePress((long)5,"صحي","Santé","Hygienic");
     CategoriePress Cate6=new CategoriePress((long)6,"سياحي","Touristique","Touristic");
     CategoriePress Cate7=new CategoriePress((long)7,"فلاحي","Agricole","Agricultural");
     CategoriePress Cate8=new CategoriePress((long)8,"تكنولوجي","Technologique","Technological");
     CategoriePress Cate9=new CategoriePress((long)9,"سيارات","Automobile","Automobile");
        if(categoriePresseRepository.count() == 0)
        {
            categoriePresseRepository.save(Cate1);
            categoriePresseRepository.save(Cate2);
            categoriePresseRepository.save(Cate3);
            categoriePresseRepository.save(Cate4);
            categoriePresseRepository.save(Cate5);
            categoriePresseRepository.save(Cate6);
            categoriePresseRepository.save(Cate7);
            categoriePresseRepository.save(Cate8);
            categoriePresseRepository.save(Cate9);
        }
     }
}
