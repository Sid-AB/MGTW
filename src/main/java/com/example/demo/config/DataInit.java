package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entities.CategoriePress;
import com.example.demo.repository.CategoriePresseRepository;
import com.example.demo.repository.LanguageRepository;
import com.example.demo.entities.Language;
@Component
public class DataInit implements CommandLineRunner {
 
    @Autowired
    private CategoriePresseRepository categoriePresseRepository;

    @Autowired
     private LanguageRepository LanguageRepository ;

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
     

      Language lang1=new Language((long)1,"العربية","Arabe","Arabic");
      Language lang2=new Language((long)2,"الفرنسية","Français","French");
      Language lang3=new Language((long)3,"الإنجليزية","Anglais","English");
      Language lang4=new Language((long)4,"العربية/الفرنسية","Arabe/Français","Arabic/French");
      Language lang5=new Language((long)5,"العربية/الإنجليزية","Arabe/Anglais","Arabic/English");
      Language lang6=new Language((long)6,"الفرنسية/الإنجليزية","Français/Anglais","French/English");
      Language lang7=new Language((long)7,"العربية/الفرنسية/الإنجليزية","Arabe/Français/Anglais","Arabic/French/English");
         if(LanguageRepository.count() == 0)
         {
            LanguageRepository.save(lang1);
            LanguageRepository.save(lang2);
            LanguageRepository.save(lang3);
            LanguageRepository.save(lang4);
            LanguageRepository.save(lang5);
            LanguageRepository.save(lang6);
            LanguageRepository.save(lang7);
             
         }
        }
}
