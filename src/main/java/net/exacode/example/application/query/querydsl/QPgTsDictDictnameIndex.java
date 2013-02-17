package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTsDictDictnameIndex is a Querydsl query type for QPgTsDictDictnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTsDictDictnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgTsDictDictnameIndex> {

    private static final long serialVersionUID = 910491137;

    public static final QPgTsDictDictnameIndex pgTsDictDictnameIndex = new QPgTsDictDictnameIndex("pg_ts_dict_dictname_index");

    public final SimplePath<Object> dictname = createSimple("dictname", Object.class);

    public final NumberPath<Long> dictnamespace = createNumber("dictnamespace", Long.class);

    public QPgTsDictDictnameIndex(String variable) {
        super(QPgTsDictDictnameIndex.class, forVariable(variable), "pg_catalog", "pg_ts_dict_dictname_index");
    }

    @SuppressWarnings("all")
    public QPgTsDictDictnameIndex(Path<? extends QPgTsDictDictnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_ts_dict_dictname_index");
    }

    public QPgTsDictDictnameIndex(PathMetadata<?> metadata) {
        super(QPgTsDictDictnameIndex.class, metadata, "pg_catalog", "pg_ts_dict_dictname_index");
    }

}

