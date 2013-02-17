package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOpclassOidIndex is a Querydsl query type for QPgOpclassOidIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOpclassOidIndex extends com.mysema.query.sql.RelationalPathBase<QPgOpclassOidIndex> {

    private static final long serialVersionUID = 1491944900;

    public static final QPgOpclassOidIndex pgOpclassOidIndex = new QPgOpclassOidIndex("pg_opclass_oid_index");

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public QPgOpclassOidIndex(String variable) {
        super(QPgOpclassOidIndex.class, forVariable(variable), "pg_catalog", "pg_opclass_oid_index");
    }

    @SuppressWarnings("all")
    public QPgOpclassOidIndex(Path<? extends QPgOpclassOidIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_opclass_oid_index");
    }

    public QPgOpclassOidIndex(PathMetadata<?> metadata) {
        super(QPgOpclassOidIndex.class, metadata, "pg_catalog", "pg_opclass_oid_index");
    }

}

