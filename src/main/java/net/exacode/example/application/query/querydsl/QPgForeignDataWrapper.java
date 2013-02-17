package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgForeignDataWrapper is a Querydsl query type for QPgForeignDataWrapper
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgForeignDataWrapper extends com.mysema.query.sql.RelationalPathBase<QPgForeignDataWrapper> {

    private static final long serialVersionUID = 385540784;

    public static final QPgForeignDataWrapper pgForeignDataWrapper = new QPgForeignDataWrapper("pg_foreign_data_wrapper");

    public final SimplePath<Object[]> fdwacl = createSimple("fdwacl", Object[].class);

    public final NumberPath<Long> fdwhandler = createNumber("fdwhandler", Long.class);

    public final StringPath fdwname = createString("fdwname");

    public final SimplePath<Object[]> fdwoptions = createSimple("fdwoptions", Object[].class);

    public final NumberPath<Long> fdwowner = createNumber("fdwowner", Long.class);

    public final NumberPath<Long> fdwvalidator = createNumber("fdwvalidator", Long.class);

    public QPgForeignDataWrapper(String variable) {
        super(QPgForeignDataWrapper.class, forVariable(variable), "pg_catalog", "pg_foreign_data_wrapper");
    }

    @SuppressWarnings("all")
    public QPgForeignDataWrapper(Path<? extends QPgForeignDataWrapper> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_foreign_data_wrapper");
    }

    public QPgForeignDataWrapper(PathMetadata<?> metadata) {
        super(QPgForeignDataWrapper.class, metadata, "pg_catalog", "pg_foreign_data_wrapper");
    }

}

