package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsDict is a Querydsl query type for QPgTsDict
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsDict extends com.mysema.query.sql.RelationalPathBase<QPgTsDict> {

    private static final long serialVersionUID = 734770672;

    public static final QPgTsDict pgTsDict = new QPgTsDict("pg_ts_dict");

    public final StringPath dictinitoption = createString("dictinitoption");

    public final StringPath dictname = createString("dictname");

    public final NumberPath<Long> dictnamespace = createNumber("dictnamespace", Long.class);

    public final NumberPath<Long> dictowner = createNumber("dictowner", Long.class);

    public final NumberPath<Long> dicttemplate = createNumber("dicttemplate", Long.class);

    public QPgTsDict(String variable) {
        super(QPgTsDict.class, forVariable(variable), "pg_catalog", "pg_ts_dict");
    }

    @SuppressWarnings("all")
    public QPgTsDict(Path<? extends QPgTsDict> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_dict");
    }

    public QPgTsDict(PathMetadata<?> metadata) {
        super(QPgTsDict.class, metadata, "pg_catalog", "pg_ts_dict");
    }

}

