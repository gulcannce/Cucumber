

  Feature: US1003 kullanıcı testotomasyon sayfasına istediği kelimeyi aratır

    Scenario: TC07 Kullanıcı istediği kelimeyi aratabilmeli

      Given kullanıcı test otomasyonu sayfasına gider
      When arama kutusuna "iphone" yazıp aratır
      Then arama sonucunda ürün bulunabildiğini test eder
      And 5 saniye bekler
      And sayfayı kapatır