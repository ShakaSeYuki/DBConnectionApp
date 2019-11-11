# DBConnectionApp

SpringBootでのMySQL接続とCURD用のリポジトリ

# Requirement
 
* MySQL 8.0.18 [Site](https://dev.mysql.com/downloads/windows/installer/8.0.html)
* JDK 8u231 [Site](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Maven 3.6.2 [Site](https://maven.apache.org/download.cgi)
* Lombok 1.18.10 [Site](https://projectlombok.org/download)
* Spring Tool Suite 3.9.10 [Site](https://spring.io/tools3/sts/all)

# Installation
 JDKとMaven（Cドライブ直下に移動）をインストール後環境変数を設定する。

JDK(JAVA_HOME)  
```
C:\Program Files\Java\jdk1.8.0_231
```

Maven(M2_HOME)  
```
C:\apache-maven-3.6.2
```

設定後にpathを通す(システム変数に下記を追加する)
```
%JAVA_HOME%\bin
```
```
%M2_HOME%\bin
```

ユーザーディレクトリに.m2ファイルを作成し、settings.xmlをコピー
Windows PowerShellでのコマンド
```
mkdir .m2
```
```
copy C:\apache-maven-3.6.2\conf\settings.xml .m2
```

Spring Tool Suite(STS)を解凍してインストール(解凍後任意の場所に移動しておく)  
※標準解凍ソフトでpath to longエラーが出る場合はZIPファイル名を短くする、それでもダメな場合は7-ZIP等で解凍する

Lombockを起動したら「IDEs」の項目にSTS.exeにチェックが入っているのを確認後install/updateボタンをクリック。

# Usage
 
STS.exeをダブルクリックしてSTSを起動。
 
# Note 

 [STSインストール参考リンク](https://qiita.com/segur/items/4cd283d9763a1953f336)

# Author
 
* Yuki Nishino