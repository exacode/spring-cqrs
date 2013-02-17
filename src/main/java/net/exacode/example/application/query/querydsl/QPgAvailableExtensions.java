package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgAvailableExtensions is a Querydsl query type for QPgAvailableExtensions
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgAvailableExtensions extends com.mysema.query.sql.RelationalPathBase<QPgAvailableExtensions> {

    private static final long serialVersionUID = 241946754;

    public static final QPgAvailableExtensions pgAvailableExtensions = new QPgAvailableExtensions("pg_available_extensions");

    public final StringPath comment = createString("comment");

    public final StringPath defaultVersion = createString("default_version");

    public final StringPath installedVersion = createString("installed_version");

    public final StringPath name = createString("name");

    public QPgAvailableExtensions(String variable) {
        super(QPgAvailableExtensions.class, forVariable(variable), "pg_catalog", "pg_available_extensions");
    }

    @SuppressWarnings("all")
    public QPgAvailableExtensions(Path<? extends QPgAvailableExtensions> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_available_extensions");
    }

    public QPgAvailableExtensions(PathMetadata<?> metadata) {
        super(QPgAvailableExtensions.class, metadata, "pg_catalog", "pg_available_extensions");
    }

}

