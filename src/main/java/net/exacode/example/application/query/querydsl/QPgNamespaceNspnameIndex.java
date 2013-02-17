package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgNamespaceNspnameIndex is a Querydsl query type for QPgNamespaceNspnameIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgNamespaceNspnameIndex extends com.mysema.query.sql.RelationalPathBase<QPgNamespaceNspnameIndex> {

    private static final long serialVersionUID = -1363151204;

    public static final QPgNamespaceNspnameIndex pgNamespaceNspnameIndex = new QPgNamespaceNspnameIndex("pg_namespace_nspname_index");

    public final SimplePath<Object> nspname = createSimple("nspname", Object.class);

    public QPgNamespaceNspnameIndex(String variable) {
        super(QPgNamespaceNspnameIndex.class, forVariable(variable), "pg_catalog", "pg_namespace_nspname_index");
    }

    @SuppressWarnings("all")
    public QPgNamespaceNspnameIndex(Path<? extends QPgNamespaceNspnameIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_namespace_nspname_index");
    }

    public QPgNamespaceNspnameIndex(PathMetadata<?> metadata) {
        super(QPgNamespaceNspnameIndex.class, metadata, "pg_catalog", "pg_namespace_nspname_index");
    }

}

