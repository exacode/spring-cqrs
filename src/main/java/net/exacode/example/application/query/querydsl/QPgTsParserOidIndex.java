package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsParserOidIndex is a Querydsl query type for QPgTsParserOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsParserOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsParserOidIndex> {

    private static final long serialVersionUID = 1256281121;

    public static final QPgTsParserOidIndex pgTsParserOidIndex = new QPgTsParserOidIndex("pg_ts_parser_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgTsParserOidIndex(String variable) {
        super(QPgTsParserOidIndex.class, forVariable(variable), "pg_catalog", "pg_ts_parser_oid_index");
    }

    @SuppressWarnings("all")
    public QPgTsParserOidIndex(Path<? extends QPgTsParserOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_parser_oid_index");
    }

    public QPgTsParserOidIndex(PathMetadata<?> metadata) {
        super(QPgTsParserOidIndex.class, metadata, "pg_catalog", "pg_ts_parser_oid_index");
    }

}

