package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11558Index is a Querydsl query type for QPgToast11558Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11558Index extends com.mysema.query.sql.RelationalPathBase<QPgToast11558Index> {

    private static final long serialVersionUID = -757354266;

    public static final QPgToast11558Index pgToast11558Index = new QPgToast11558Index("pg_toast_11558_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast11558Index(String variable) {
        super(QPgToast11558Index.class, forVariable(variable), "pg_toast", "pg_toast_11558_index");
    }

    @SuppressWarnings("all")
    public QPgToast11558Index(Path<? extends QPgToast11558Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11558_index");
    }

    public QPgToast11558Index(PathMetadata<?> metadata) {
        super(QPgToast11558Index.class, metadata, "pg_toast", "pg_toast_11558_index");
    }

}

