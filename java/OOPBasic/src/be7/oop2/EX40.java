package be7.oop2;

import be7.model.*;

public class EX40 {
    public static void main(String[] args) {
       SuperRemoCon sr = new TV();
       sr.chUp();
       sr.chDown();
       sr.volUp();
       sr.volDown();
       sr.internet();

       // Java 제공해주는 API --> DataBase API 활용(크롤링, Open API) : MySQL(O), Oracle, MS-SQL<-->WEB AWS(EC2, RDS)
       // Java 제공해주는 API --> Network API 활용(크롤링, Open API)
       // Java 제공해주는 API --> IO API 활용(파일 처리)
       // Java 제공해주는 API --> Thread API 활용(병렬처리, 동시처리 --> 채팅)
       // Java 제공해주는 API --> Util API 활용(List, Map, Set)
       // 다른 회사에서 제공해주는 API --> JSON, XML(Gson, org.json, Jsoup, POI, iText...)

    }
}
