package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAmNameIndex is a Querydsl query type for QPgAmNameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAmNameIndex extends com.mysema.query.sql.RelationalPathBase<QPgAmNameIndex> {

    private static final long serialVersionUID = -1302897664;

    public static final QPgAmNameIndex pgAmNameIndex = new QPgAmNameIndex("pg_am_name_index");

    public final SimplePath<Object> amname = createSimple("amname", Object.class);

    public QPgAmNameIndex(String variable) {
        super(QPgAmNameIndex.class, forVariable(variable), "pg_catalog", "pg_am_name_index");
    }

    @SuppressWarnings("all")
    public QPgAmNameIndex(Path<? extends QPgAmNameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_am_name_index");
    }

    public QPgAmNameIndex(PathMetadata<?> metadata) {
        super(QPgAmNameIndex.class, metadata, "pg_catalog", "pg_am_name_index");
    }

}

