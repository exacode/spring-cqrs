package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgTypeTypnameNspIndex is a Querydsl query type for QPgTypeTypnameNspIndex
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgTypeTypnameNspIndex extends com.mysema.query.sql.RelationalPathBase<QPgTypeTypnameNspIndex> {

    private static final long serialVersionUID = -11336664;

    public static final QPgTypeTypnameNspIndex pgTypeTypnameNspIndex = new QPgTypeTypnameNspIndex("pg_type_typname_nsp_index");

    public final SimplePath<Object> typname = createSimple("typname", Object.class);

    public final NumberPath<Long> typnamespace = createNumber("typnamespace", Long.class);

    public QPgTypeTypnameNspIndex(String variable) {
        super(QPgTypeTypnameNspIndex.class, forVariable(variable), "pg_catalog", "pg_type_typname_nsp_index");
    }

    @SuppressWarnings("all")
    public QPgTypeTypnameNspIndex(Path<? extends QPgTypeTypnameNspIndex> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_type_typname_nsp_index");
    }

    public QPgTypeTypnameNspIndex(PathMetadata<?> metadata) {
        super(QPgTypeTypnameNspIndex.class, metadata, "pg_catalog", "pg_type_typname_nsp_index");
    }

}

