package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgForeignServerNameIndex is a Querydsl query type for QPgForeignServerNameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgForeignServerNameIndex extends com.mysema.query.sql.RelationalPathBase<QPgForeignServerNameIndex> {

    private static final long serialVersionUID = -2134645077;

    public static final QPgForeignServerNameIndex pgForeignServerNameIndex = new QPgForeignServerNameIndex("pg_foreign_server_name_index");

    public final SimplePath<Object> srvname = createSimple("srvname", Object.class);

    public QPgForeignServerNameIndex(String variable) {
        super(QPgForeignServerNameIndex.class, forVariable(variable), "pg_catalog", "pg_foreign_server_name_index");
    }

    @SuppressWarnings("all")
    public QPgForeignServerNameIndex(Path<? extends QPgForeignServerNameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_foreign_server_name_index");
    }

    public QPgForeignServerNameIndex(PathMetadata<?> metadata) {
        super(QPgForeignServerNameIndex.class, metadata, "pg_catalog", "pg_foreign_server_name_index");
    }

}

