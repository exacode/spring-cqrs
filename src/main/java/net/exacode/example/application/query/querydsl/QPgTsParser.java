package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsParser is a Querydsl query type for QPgTsParser
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsParser extends com.mysema.query.sql.RelationalPathBase<QPgTsParser> {

    private static final long serialVersionUID = 2076590041;

    public static final QPgTsParser pgTsParser = new QPgTsParser("pg_ts_parser");

    public final SimplePath<Object> prsend = createSimple("prsend", Object.class);

    public final SimplePath<Object> prsheadline = createSimple("prsheadline", Object.class);

    public final SimplePath<Object> prslextype = createSimple("prslextype", Object.class);

    public final StringPath prsname = createString("prsname");

    public final NumberPath<Long> prsnamespace = createNumber("prsnamespace", Long.class);

    public final SimplePath<Object> prsstart = createSimple("prsstart", Object.class);

    public final SimplePath<Object> prstoken = createSimple("prstoken", Object.class);

    public QPgTsParser(String variable) {
        super(QPgTsParser.class, forVariable(variable), "pg_catalog", "pg_ts_parser");
    }

    @SuppressWarnings("all")
    public QPgTsParser(Path<? extends QPgTsParser> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_parser");
    }

    public QPgTsParser(PathMetadata<?> metadata) {
        super(QPgTsParser.class, metadata, "pg_catalog", "pg_ts_parser");
    }

}

