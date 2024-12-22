
  Feature: US1001 Testotomasyonu arama testi

    Scenario: TC01 Kullanıcı sitede phone aratabilmeli

      Given kullanıcı test otomasyonu sayfasına gider
      When arama kutusuna phone yazıp aratır
      Then  arama sonucunda ürün bulunabildiğini test eder
      And sayfayı kapatır


      Scenario: TC02 Kullanıcı sitede dress aratabilmeli

        Given kullanıcı test otomasyonu sayfasına gider
        When arama kutusuna dress yazıp aratır
        Then arama sonucunda ürün bulunabildiğini test eder
        And sayfayı kapatır

        Scenario: TC03 kullanıcı sitede samsung aratabilmeli

          Given kullanıcı test otomasyonu sayfasına gider
          When arama kutusuna samsung yazıp aratır
          Then arama sonucunda ürün bulunabildiğini test eder
          And sayfayı kapatır

