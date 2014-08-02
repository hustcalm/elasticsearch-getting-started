elasticsearch-getting-started
=============================

For beginners to ElasticSearch. You know, for search.

### Dev Enviroment 
Blow are instructions for Mac OS X users, people with Linux or Windows may find your own way.

#### Maven
    brew install maven

#### ElasticSearch and Lucene
    brew install elasticsearch && brew info elasticsearch

> ElasticSearch requires Java 7; you will need to install an appropriate JDK.

> To have launchd start elasticsearch at login:
>     ln -sfv /usr/local/opt/elasticsearch/*.plist ~/Library/LaunchAgents
> Then to load elasticsearch now:
>    launchctl load ~/Library/LaunchAgents/homebrew.mxcl.elasticsearch.plist
> Or, if you don't want/need launchctl, you can just run:
>    elasticsearch --config=/usr/local/opt/elasticsearch/config/elasticsearch.yml

*   [Launchctl](https://developer.apple.com/library/mac/documentation/Darwin/Reference/ManPages/man1/launchctl.1.html)

#### Java
*   [Java on Mac](rick-hightower.blogspot.com/2013/11/setting-up-new-mac-book-for-java-dev.html)
*   [Java 7 and Eclipse](http://techblog.41concepts.com/2011/10/05/howto-java-7ea-eclipse-3-7-1-on-mac-os-x/)

Remember to set `JAVA_HOME` for the new JDK, such as:

    JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.7.0_65.jdk/Contents/Home/ 

#### Git and SSH
    brew install git
    brew install openssh

### Tutorials

#### ElasticSearch
*   [Getting Started With ElasticSearch](http://red-badger.com/blog/2013/11/08/getting-started-with-elasticsearch/)
*   [ElasticSearch 101 – a getting started tutorial](http://joelabrahamsson.com/elasticsearch-101/)
*   [Basic ElasticSearch Concepts](http://www.elasticsearchtutorial.com/basic-elasticsearch-concepts.html)
*   [ElasticSearch in 5 minutes](http://www.elasticsearchtutorial.com/elasticsearch-in-5-minutes.html)
*   [quick-introduction-to-elasticsearch](https://speakerdeck.com/imotov/quick-introduction-to-elasticsearch)
*   [elasticsearch-data](https://speakerdeck.com/imotov/elasticsearch-data)
*   [Getting Started With ElasticSearch:Part 1 - Indexing](http://blog.florian-hopf.de/2013/05/getting-started-with-elasticsearch-part.html)
*   [Getting Started With ElasticSearch:Part 2 - Querying](http://blog.florian-hopf.de/2013/08/getting-started-with-elasticsearch-part.html)
*   [分布式搜索elasticsearch几个概念解析](http://blog.csdn.net/laigood/article/details/7421173)
*   [elasticsearch中文站](http://www.elasticsearch.cn/)
*   [ElasticSearch 权威指南](https://www.gitbook.io/book/fuxiaopang/learnelasticsearch)
*   [elasticsearch初探](http://blog.segmentfault.com/lvye/1190000000448816)
*   [elasticsearch-getting-started - dzone](http://java.dzone.com/articles/elasticsearch-getting-started)
*   [ElasticSearch简单入门](http://www.oschina.net/translate/elasticsearch-getting-started)

#### Lucene
*   [Lucene Demo](http://lucene.apache.org/core/4_9_0/demo/overview-summary.html#overview_description)
*   [实战 Lucene，第 1 部分: 初识 Lucene](http://www.ibm.com/developerworks/cn/java/j-lo-lucene1/)
*   [Lucene in 5 minutes](http://www.lucenetutorial.com/lucene-in-5-minutes.html)
*   [Search engine Lucene vs Database search](http://stackoverflow.com/questions/4638671/search-engine-lucene-vs-database-search)

#### Java
*   [Java 7 Docs](http://docs.oracle.com/javase/7/docs/)

#### Maven
*   [Maven by Example](http://books.sonatype.com/mvnex-book/reference/public-book.html)
*   [Maven: The Complete Reference](http://books.sonatype.com/mvnref-book/reference/public-book.html)
*   [Maven in 5 Minutes](http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
*   [Maven Getting Started Guide](http://maven.apache.org/guides/getting-started/)

### Algorithms

#### Inverted Index
*   [Inveted Index in ElasticSearch](http://www.elasticsearch.org/guide/en/elasticsearch/guide/current/inverted-index.html)
*   [A first take at building an inverted index](http://nlp.stanford.edu/IR-book/html/htmledition/a-first-take-at-building-an-inverted-index-1.html)
*   [Inverted Index on Rosseta Code](http://rosettacode.org/wiki/Inverted_index)

### Exams

#### ElasticSearch Plugin
*   [Creating an Elasticsearch Plugin](http://jfarrell.github.io/)
*   [Writing an Elasticsearch Plugin: Getting Started](https://www.found.no/foundation/writing-a-plugin/)
*   [HOW TO WRITE AN ELASTICSEARCH RIVER PLUGIN](http://blog.trifork.com/2013/01/10/how-to-write-an-elasticsearch-river-plugin/)
*   [brusic/elasticsearch-hello-world-plugin](https://github.com/brusic/elasticsearch-hello-world-plugin/)
*   [awnuxkjy/es-ik](https://github.com/awnuxkjy/es-ik)

#### ElasticSearch API
*   [elasticsearch.cn - API](http://www.elasticsearch.cn/guide/reference/api)

### Others
*   [Gradle - Build Automation Evolved](http://www.gradle.org)
*   [Netty - NIO client server framework](http://netty.io)
*   [Jest - ElasticSearch Java Rest Client](https://github.com/searchbox-io/Jest)
*   [Full Text Search Engines vs. DBMS](http://searchhub.org/2009/09/02/full-text-search-engines-vs-dbms/)
*   [Grunt - The JavaScript Task Runner](http://www.gruntjs.com)
