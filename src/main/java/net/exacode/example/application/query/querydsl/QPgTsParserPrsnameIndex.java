package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsParserPrsnameIndex is a Querydsl query type for QPgTsParserPrsnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsParserPrsnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsParserPrsnameIndex> {

    private static final long serialVersionUID = 689698799;

    public static final QPgTsParserPrsnameIndex pgTsParserPrsnameIndex = new QPgTsParserPrsnameIndex("pg_ts_parser_prsname_index");

    public final SimplePath<Object> prsname = createSimple("prsname", Object.class);

    public final NumberPath<Long> prsnamespace = createNumber("prsnamespace", Long.class);

    public QPgTsParserPrsnameIndex(String variable) {
        super(QPgTsParserPrsnameIndex.class, forVariable(variable), "pg_catalog", "pg_ts_parser_prsname_index");
    }

    @SuppressWarnings("all")
    public QPgTsParserPrsnameIndex(Path<? extends QPgTsParserPrsnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_parser_prsname_index");
    }

    public QPgTsParserPrsnameIndex(PathMetadata<?> metadata) {
        super(QPgTsParserPrsnameIndex.class, metadata, "pg_catalog", "pg_ts_parser_prsname_index");
    }

}

