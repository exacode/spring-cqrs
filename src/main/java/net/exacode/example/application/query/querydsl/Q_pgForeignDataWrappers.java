package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * Q_pgForeignDataWrappers is a Querydsl query type for Q_pgForeignDataWrappers
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class Q_pgForeignDataWrappers extends com.mysema.query.sql.RelationalPathBase<Q_pgForeignDataWrappers> {

    private static final long serialVersionUID = -463722580;

    public static final Q_pgForeignDataWrappers PgForeignDataWrappers = new Q_pgForeignDataWrappers("_pg_foreign_data_wrappers");

    public final SimplePath<Object> authorizationIdentifier = createSimple("authorization_identifier", Object.class);

    public final SimplePath<Object[]> fdwoptions = createSimple("fdwoptions", Object[].class);

    public final NumberPath<Long> fdwowner = createNumber("fdwowner", Long.class);

    public final SimplePath<Object> foreignDataWrapperCatalog = createSimple("foreign_data_wrapper_catalog", Object.class);

    public final SimplePath<Object> foreignDataWrapperLanguage = createSimple("foreign_data_wrapper_language", Object.class);

    public final SimplePath<Object> foreignDataWrapperName = createSimple("foreign_data_wrapper_name", Object.class);

    public final NumberPath<Long> oid = createNumber("oid", Long.class);

    public Q_pgForeignDataWrappers(String variable) {
        super(Q_pgForeignDataWrappers.class, forVariable(variable), "information_schema", "_pg_foreign_data_wrappers");
    }

    @SuppressWarnings("all")
    public Q_pgForeignDataWrappers(Path<? extends Q_pgForeignDataWrappers> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "_pg_foreign_data_wrappers");
    }

    public Q_pgForeignDataWrappers(PathMetadata<?> metadata) {
        super(Q_pgForeignDataWrappers.class, metadata, "information_schema", "_pg_foreign_data_wrappers");
    }

}

