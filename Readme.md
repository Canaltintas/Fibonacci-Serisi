# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Ödev - Fibonacci Serisi
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

### Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.

## Programın Çalışması : 
- diziyi oluşturmak için a=0,b=1 ve bir önce ki değeri tutacak bir c=0 değişkeni oluşturulur. 
- Kullanıcıdan dizinin eleman sayısı alınır.(n)
- bir for döngüsü girilen n değişkeni kadar dönecek şekilde oluşturulur.
- c=a+b işlemi yaptırılır.(c=1+0)
- a=b ile b'nin değeri a'ya eşitlenir.(a=1,b=1)
- ilk işlemde bulunan c değeri b değişkenine atanır.(b=1,c=1)
- c değişkeni ekrana yazdırılır.
- döngü bitene kadar işlemler devam eder.

##### Örnek :
Döngünü dönüş sayısı i dersek ;
- i=1 için:
c=a+b (0=0+1)
a=b (a=1,b=1)
b=c (b=1,c=1)
Çıktı = 1
- i=2 için;
c=a+b (1=1+1),(c=2)
a=b (a=1,b=1)
b=c (b=2,c=2)
Çıktı = 2
- i =3 için:
c=a+b(2=1+2),(c=3)
a=b (a=2,b=2)
b=c (b=3,c=3)
Çıktı = 3
- ...