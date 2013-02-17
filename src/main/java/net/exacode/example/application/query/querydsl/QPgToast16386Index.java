package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast16386Index is a Querydsl query type for QPgToast16386Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast16386Index extends com.mysema.query.sql.RelationalPathBase<QPgToast16386Index> {

    private static final long serialVersionUID = -2085059918;

    public static final QPgToast16386Index pgToast16386Index = new QPgToast16386Index("pg_toast_16386_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast16386Index(String variable) {
        super(QPgToast16386Index.class, forVariable(variable), "pg_toast", "pg_toast_16386_index");
    }

    @SuppressWarnings("all")
    public QPgToast16386Index(Path<? extends QPgToast16386Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_16386_index");
    }

    public QPgToast16386Index(PathMetadata<?> metadata) {
        super(QPgToast16386Index.class, metadata, "pg_toast", "pg_toast_16386_index");
    }

}

