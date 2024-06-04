# بازآرایی
الگوی Facade (CompilerFacade): با معرفی کلاس CompilerFacade تعامل با کلاس Parser را ساده کردیم که فرآیند پارس کردن را مدیریت می‌کند. پیچیدگی را کاهش داده و منطق اصلی برنامه را تمیزتر و نگهداری آن را آسان‌تر می‌کند.

الگوی Facade (CodeGenerationFacade): یک کلاس CodeGenerationFacade معرفی کردیم تا تعامل با کلاس‌های CodeGenerator، SymbolTable و Memory را کپسوله کند. پیچیدگی تولید کد و مدیریت نمادها را پنهان کرده و کلاس Parser را ساده‌تر و متمرکزتر بر منطق پارس می‌کند.

الگوی State/Strategy: دستور switch در کلاس CodeGenerator را با نقشه‌ای از زیرکلاس‌های SemanticAction جایگزین کردیم تا اقدامات مختلف را مدیریت کند. مدولاریت و گسترش‌پذیری را بهبود می‌بخشد، زیرا هر رفتار در کلاس خود کپسوله شده است.

جدا کردن Query از Modifier: متدهای موجود در کلاس Memory را به دو متد جداگانه برای پرس و جوی آدرس بعدی و تغییر حالت تقسیم کردیم. به اصل جدا کردن پرس و جو از تغییرات پایبند است و خوانایی و نگهداری کد را بهبود می‌بخشد.

فیلد Self-Encapsulated: فیلد address در کلاس Symbol را با ارائه متدهای getter و setter کپسوله کردیم. کپسوله‌سازی را بهبود می‌بخشد و امکان افزودن منطق اضافی به دسترسی به فیلد را در صورت نیاز فراهم می‌کند، که نگهداری کد را آسان‌تر می‌کند.

الگوی Introduce Parameter Object: پارامترهای مرتبط با آدرس و نوع را در یک شیء AddressParameter در کلاس CodeGenerator گروه‌بندی کردیم. امضای متدها را ساده‌تر و خوانایی را بهبود می‌بخشد، که باعث می‌شود کد آسان‌تر فهمیده و نگهداری شود.

الگوی Extract Method: متد بزرگ startParse در کلاس Parser را به متدهای کوچکتر و متمرکزتر تقسیم کردیم. خوانایی و نگهداری را بهبود می‌بخشد، زیرا متدها را متمرکز بر یک مسئولیت خاص نگه می‌دارد و فهم و اشکال‌زدایی کد را آسان‌تر می‌کند.

# MiniJava
Mini-Java is a subset of Java. MiniJava compiler implement a compiler for the Mini-java
programming language.


# Rules
```
Goal --> Source EOF
Source --> ClassDeclarations MainClass
MainClass --> class Identifier { public static void main() { VarDeclarations Statements}}
ClassDeclarations --> ClassDeclaration ClassDeclarations | lambda
ClassDeclaration --> class Identifier Extension { FieldDeclarations MethodDeclarations }
Extension --> extends Identifier | lambda
FieldDeclarations --> FieldDeclaration FieldDeclarations | lambda
FieldDeclaration --> static Type Identifier ;
VarDeclarations --> VarDeclaration VarDeclarations | lambda
VarDeclaration --> Type Identifier ;
MethodDeclarations --> MethodDeclaration MethodDeclarations | lambda
MethodDeclaration --> public static Type Identifier ( Parameters ) { VarDeclarations Statements return GenExpression ; }
Parameters --> Type Identifier Parameter | lambda
Parameter --> , Type Identifier Parameter | lambda
Type --> boolean | int
Statements --> Statements Statement | lambda
Statement --> { Statements } | if ( GenExpression ) Statement else Statement | while ( GenExpression ) Statement | System.out.println ( GenExpression ) ; | Identifier = GenExpression ;
GenExpression --> Expression | RelExpression
Expression --> Expression + Term | Expression - Term | Term
Term --> Term * Factor | Factor
Factor --> ( Expression ) | Identifier | Identifier . Identifier | Identifier . Identifier ( Arguments ) | true | false | Integer
RelExpression --> RelExpression && RelTerm | RelTerm
RelTerm --> Expression == Expression | Expression < Expression
Arguments --> GenExpression Argument | lambda
Argument --> , GenExpression Argument | lambda
Identifier --> <IDENTIFIER_LITERAL>
Integer --> <INTEGER_LITERAL>
```


<div dir="rtl">

سوال اول:

کد تمیز:
کد تمیز کدی است که خواندن، نگهداری، درک و تغییر آن از طریق ساختار و سازگاری آسان است، اما برای مقاومت در برابر نیازهای عملکرد، قوی و ایمن باقی می‌ماند.

بدهی فنی:
زمانی که در فرایند ایجاد و توسعه نرم‌افزار به جای راه درست و بهترین راه، آسان‌ترین و یا سریع‌ترین راه انتخاب و اجرا می‌شود اثرات مخرب دارد که اشکالاتی در معماری و یا نگهداری آسان برنامه و یا تغییرات آینده ایجاد می‌کند که باید در آینده آن کد اصلاح شود و راه درست جایگزین شود که مفهوم بدهی فنی است که در آینده پرداخت خواهد شد (برای انجام دوباره و اصلاح کد).

بوی بد:
بوهای بد کد نتیجه برنامه‌نویسی ضعیف یا نادرست است. این لغزش‌ها در کد برنامه اغلب می‌توانند مستقیماً به اشتباهات برنامه‌نویس برنامه در طول فرآیند کدنویسی ردیابی شوند.

سوال دوم:

انواع بوهای بد

Bloaters

کدها، توابع و کلاس‌هایی هستند که به اندازه‌ای بزرگ شده‌اند که کار کردن با آنها سخت است. مانند کلاس‌های بزرگ، توابع طولانی.

Object-Orientation Abusers

زمانی که اصول شی‌گرایی به صورت نادرست به کار بروند و یا ناقص اجرا شوند مانند Alternative Classes with Different Interfaces یا Refused Bequest.

Change Preventers

این بوی بد برای زمانی هست که اگر نیاز به تغییر چیزی در یک مکان در کدی هست، باید در جاهای دیگر نیز تغییرات زیادی ایجاد شوند. در نتیجه توسعه برنامه بسیار پیچیده‌تر و گران‌تر می‌شود. برای مثال Divergent Change، Parallel Inheritance Hierarchies، Shotgun Surgery.

Dispensables

یک چیز بی‌معنی و غیر ضروری است که نبود آن کد را پاک‌تر، کارآمدتر و درک آسان‌تر می‌کند. مانند Comments، Duplicate Code.

Couplers

این بوها در مواردی هستند که دو کلاس جفت شدگی بیش از حدی دارند. برای مثال Message Chains، Middle Man.

سوال سوم:

رفع بوی بد Lazy Class:

Lazy class در دسته Dispensables قرار دارد. بازآرایی‌های مناسب برای برطرف کردن آن:

Collapse Hierarchy: برای کلاس‌هایی که کارایی کمی دارند و زیرکلاس کلاس دیگر هستند که در این روش با کلاس پدر خودشان ادغام می‌شوند.

Inline Class: برای کلاس‌هایی که نه کاری می‌کنند و نه وظیفه خاصی در قبال بقیه کلاس‌ها دارند و مواردی از این دست که می‌شوند برای برطرف کردن آن‌ها ویژگی‌هایشان را به کلاس دیگری منتقل کرد و کلاس را حذف کرد.

کلاس‌هایی که به منظور اهداف توسعه نرم‌افزار در آینده ایجاد و ترسیم شده هستند در حالی که کارایی ندارند این بوی بد را در آن‌ها نادیده می‌گیریم.

سوال چهارم:

کامنت‌ها در /phase2Lexer/clex

semanticFunction  در code generator بوی بد Switch Statements  را دارد

Switch Statements  در lexicalAnalyzer/LexicalAnalyzer 

نبود موجودیت ها در ابتدا تعریف کلاس در grammer symbol

عدم استفاده از getter در فایل token

Switch Statements در phase2CodeGeneration/Phase2CodeFileManipulator

Switch Statements در project/Main 

Long Method در project/Main

Long Method و Large Class در phase2CodeGeneration/Phase2CodeFileManipulator

(Lazy Class)کلاس و تابع خالی و بی مصرف در کلاس log  

سوال پنجم:

پلاگین Formatter Maven
پلاگین Formatter Maven یک ابزار قدرتمند برای فرمت کردن کد منبع جاوا با استفاده از فرمت کننده کد Eclipse است. این پلاگین به شما امکان می‌دهد تا کد جاوای خود را بر اساس قوانین سبک کد تعریف شده در Eclipse فرمت کنید. این کار باعث می‌شود کد شما خوانا، یکنواخت و قابل نگهداری باشد.

استفاده از این پلاگین می‌تواند بسیار کمک کننده باشد زیرا:

یکنواختی کد را در کل پروژه تضمین می‌کند که باعث افزایش خوانایی و قابلیت نگهداری می‌شود.

زمان صرف شده برای فرمت کردن دستی کد را کاهش می‌دهد.

داشتن یک کد فرمت شده و یکنواخت می‌تواند بازآرایی را آسان‌تر کند زیرا کد خوانا و قابل درک است. برای همین نیز فورمتر به بازآرایی کد کمک می‌کنند.
</div>



