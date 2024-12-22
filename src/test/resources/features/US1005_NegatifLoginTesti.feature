
  Feature: US1005 Kullanıcı gecersiz bilgilerle giriş yapamaz

    Scenario: TC09 Kullanıcı gecersiz password ile giriş yapamamalı


      Given kullanici "toUrl" anasayfaya gider
      Then account butonuna basar
      And email olarak "toGecerliEmail" girer
      And password olarak "toGecerliPassword" girer
      Then signIn butonuna basar
      And giriş yapılamadıgını test eder
      And sayfayı kapatır

      Scenario: TC10 kullanıcı gecersiz email ile giriş yapamamalı

        Given kullanici "toUrl" anasayfaya gider
        Then account butonuna basar
        And email olarak "toGecerliEmail" girer
        And password olarak "toGecerliPassword" girer
        Then signIn butonuna basar
        And basarili giris yapilabildigini test eder
        And sayfayı kapatır

        Scenario: TC11 kullanıcı gecersiz email ve password ile giriş

