package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgOpclass is a Querydsl query type for QPgOpclass
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgOpclass extends com.mysema.query.sql.RelationalPathBase<QPgOpclass> {

    private static final long serialVersionUID = 1103332476;

    public static final QPgOpclass pgOpclass = new QPgOpclass("pg_opclass");

    public final BooleanPath opcdefault = createBoolean("opcdefault");

    public final NumberPath<Long> opcfamily = createNumber("opcfamily", Long.class);

    public final NumberPath<Long> opcintype = createNumber("opcintype", Long.class);

    public final NumberPath<Long> opckeytype = createNumber("opckeytype", Long.class);

    public final NumberPath<Long> opcmethod = createNumber("opcmethod", Long.class);

    public final StringPath opcname = createString("opcname");

    public final NumberPath<Long> opcnamespace = createNumber("opcnamespace", Long.class);

    public final NumberPath<Long> opcowner = createNumber("opcowner", Long.class);

    public QPgOpclass(String variable) {
        super(QPgOpclass.class, forVariable(variable), "pg_catalog", "pg_opclass");
    }

    @SuppressWarnings("all")
    public QPgOpclass(Path<? extends QPgOpclass> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_catalog", "pg_opclass");
    }

    public QPgOpclass(PathMetadata<?> metadata) {
        super(QPgOpclass.class, metadata, "pg_catalog", "pg_opclass");
    }

}

