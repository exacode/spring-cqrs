package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QPgToast11583Index is a Querydsl query type for QPgToast11583Index
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPgToast11583Index extends com.mysema.query.sql.RelationalPathBase<QPgToast11583Index> {

    private static final long serialVersionUID = 1762011022;

    public static final QPgToast11583Index pgToast11583Index = new QPgToast11583Index("pg_toast_11583_index");

    public final NumberPath<Long> chunkId = createNumber("chunk_id", Long.class);

    public final NumberPath<Integer> chunkSeq = createNumber("chunk_seq", Integer.class);

    public QPgToast11583Index(String variable) {
        super(QPgToast11583Index.class, forVariable(variable), "pg_toast", "pg_toast_11583_index");
    }

    @SuppressWarnings("all")
    public QPgToast11583Index(Path<? extends QPgToast11583Index> path) {
        super((Class)path.getType(), path.getMetadata(), "pg_toast", "pg_toast_11583_index");
    }

    public QPgToast11583Index(PathMetadata<?> metadata) {
        super(QPgToast11583Index.class, metadata, "pg_toast", "pg_toast_11583_index");
    }

}

